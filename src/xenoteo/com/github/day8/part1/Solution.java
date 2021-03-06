package xenoteo.com.github.day8.part1;

import xenoteo.com.github.day8.Instructions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The boot code is represented as a text file with one instruction per line of text.
 * Each instruction consists of an operation (acc, jmp, or nop) and an argument (a signed number like +4 or -20).
 * <ul>
 *     <li>acc increases or decreases a single global value called the accumulator by the value given in the argument.</li>
 *     <li>jmp jumps to a new instruction relative to itself.</li>
 *     <li>nop stands for No OPeration - it does nothing. The instruction immediately below it is executed next.</li>
 * </ul>
 *
 * Program contains infinite loop.
 *
 * Class finding what value is in the accumulator immediately before infinite loop starts.
 */
public class Solution {

    /**
     * Finds what value is in the accumulator immediately before infinite loop starts.
     *
     * @param instructions  the list of instructions
     * @param arguments  the list of arguments
     * @return what value is in the accumulator immediately before infinite loop starts
     */
    public int lastValueBeforeLoop(List<Instructions> instructions, List<Integer> arguments){
        int op = 0;
        int accumulator = 0;
        Set<Integer> executed = new HashSet<>();
        while (executed.add(op)){
            Instructions instruction = instructions.get(op);
            int argument = arguments.get(op);
            switch (instruction) {
                case ACC -> {
                    accumulator += argument;
                    op++;
                }
                case JMP -> op += argument;
                default -> op++;
            }
        }
        return accumulator;
    }
}
