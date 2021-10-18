class DuplicateWords {
    public static void main(String[] args) {
        String str = " this is is the word this is this";
        int count;
        String duplicates = "";
        // converting string to lower case and splitting them
        String[] words = str.toLowerCase().trim().split(" ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            //Display the duplicate words if count is greater than 1
            if (count > 1) {
                if (duplicates.isEmpty()) {
                    duplicates += " " + words[i] + " : " + count;
                } else if (!duplicates.matches("(.*) " + words[i] + " (.*)")) {
                    duplicates += " " + words[i] + " : " + count;
                }
            }
        }
        System.out.println("Printing Duplicate words with their number of occurrences: ");
        System.out.println(duplicates);
    }
}