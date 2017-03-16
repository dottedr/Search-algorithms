package search;

/**
 * Class of operations on ordered lists of strings.
 * You should fill in the bodies of these methods.
 */
public class Search {
    
    /**
     * Returns the number of unique elements in the list
     * @param a list of strings, in ascending order
     * @return number of unique elements in the list.
     */
    public int countUnique(StringList a) {
        // replace the following line with your implementation
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Returns the most commonly occurring string in the list.
     * If two or more are equally common, return the one that comes earliest.
     * @param a collection of strings, in ascending order
     * @return most common string
     */
    public String mostCommon(StringList a) {
        // replace the following line with your implementation
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Search for a string in an ordered collection
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return position of an entry in a equal to k, if any, otherwise -1
     */
    public int findEqual(StringList a, String k) {
        // replace the following line with your implementation
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Position of a string in an ordered collection
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return number of strings in a less than k
     */
    public int countLess(StringList a, String k) {
        // replace the following line with your implementation
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Position after a string in an ordered collection
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return number of strings in a less than or equal to k
     */
    public int countLessOrEqual(StringList a, String k) {
        // replace the following line with your implementation
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Determine the size of a range in an ordered collection
     * @param a collection of strings, in ascending order
     * @param k1 first string to search for
     * @param k2 second string to search for (greater than or equal to k1)
     * @return number of strings between k1 and k2 (inclusive)
     */
    public int countBetween(StringList a, String k1, String k2) {
        return countLessOrEqual(a, k2) - countLess(a, k1);
    }
    
    /**
     * Count partial matches in an ordered collection
     * @param a collection of strings, in ascending order
     * @param prefix first string to search for
     * @param suffix second string to search for
     * @return number of strings with both the prefix and suffix
     */
    public int countMatches(StringList a, String prefix, String suffix) {
        // replace the following line with your implementation
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
