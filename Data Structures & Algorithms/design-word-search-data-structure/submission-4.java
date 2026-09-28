class WordDictionary {

    class Node {
        Node[] child = new Node[26];
        boolean isEnd = false;
    }

    Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {

        Node curr = root;

        for (int i = 0; i < word.length(); i++) {

            int index = word.charAt(i) - 'a';

            if (curr.child[index] == null) {
                curr.child[index] = new Node();
            }

            curr = curr.child[index];
        }

        curr.isEnd = true;
    }

    public boolean search(String word) {
        return find(root, word, 0);
    }

    private boolean find(Node curr, String word, int index) {

        if (index == word.length()) {
            return curr.isEnd;
        }

        char ch = word.charAt(index);

        // Normal character
        if (ch != '.') {

            int pos = ch - 'a';

            if (curr.child[pos] == null) {
                return false;
            }

            return find(curr.child[pos], word, index + 1);
        }

        // '.' means any character
        for (int i = 0; i < 26; i++) {

            if (curr.child[i] != null) {

                if (find(curr.child[i], word, index + 1)) {
                    return true;
                }
            }
        }

        return false;
    }
}