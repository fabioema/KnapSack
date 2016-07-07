/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author fabio
 */

public class ItensList<Item> extends ArrayList<Item> {

    @Override
    public String toString() {
        String toReturn = "";
        Iterator<Item> itemIterator = this.iterator();
        while (itemIterator.hasNext()) {
            Item temp = itemIterator.next();
            toReturn = toReturn.concat(temp.toString());
            toReturn = toReturn + "\n";
        }
        return "\n" + toReturn + "\n";
    }
}
