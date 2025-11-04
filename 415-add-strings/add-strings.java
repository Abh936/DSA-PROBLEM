class Solution {
    public String addStrings(String num1, String num2) {
        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray();

        int i = a.length - 1;
        int j = b.length - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int x = (i >= 0) ? a[i] - '0' : 0;
            int y = (j >= 0) ? b[j] - '0' : 0;

            int sum = x + y + carry;
            sb.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}
