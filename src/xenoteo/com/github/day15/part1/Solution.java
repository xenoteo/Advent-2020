package xenoteo.com.github.day15.part1;

import java.util.LinkedList;
import java.util.List;

/**
 * In the game, the players take turns saying numbers. They begin by taking turns reading from a list of starting
 * numbers. Then, each turn consists of considering the most recently spoken number:
 * <ul>
 *     <li>If that was the first time the number has been spoken, the current player says 0.</li>
 *     <li>
 *         Otherwise, the number had been spoken before; the current player announces how many turns apart the number
 *         is from when it was previously spoken.
 *     </li>
 * </ul>
 *
 * Class finding what number will be the 2020th number spoken.
 */
public class Solution {

    /**
     * Given starting numbers, finds what number will be the 2020th number spoken.
     * Using list to keep all the numbers spoken.
     * Time complexity is O(N^2).
     *
     * @param startingNumbers  the list starting numbers
     * @return the number that will be the 2020th number spoken
     */
    public int find2020thNumber(List<Integer> startingNumbers){
        LinkedList<Integer> numbers = new LinkedList<>(startingNumbers);
        while (numbers.size() < 2020){
            int number = numbers.removeLast();
            int lastIndex = numbers.lastIndexOf(number);
            numbers.add(number);
            if (lastIndex == -1)
                numbers.add(0);
            else
                numbers.add(numbers.size() - 1 - lastIndex);
        }
        return numbers.get(2019);
    }
}
