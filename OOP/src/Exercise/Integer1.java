package Exercise;

import java.util.Scanner;

public class Integer1 {
    private static final String[] ones = {
            "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"
    };

    private static final String[] teens = {
            "mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"
    };

    private static final String[] tens = {
            "", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"
    };

    private static final String[] thousands = {
            "", "nghìn", "triệu", "tỷ", "nghìn tỷ", "triệu tỷ", "tỷ tỷ"
    };

    private static String numberToWords(int number) {
        if (number == 0) {
            return "không";
        }

        String words = "";
        String numStr = String.valueOf(number);

        while (numStr.length() > 0) {
            String group;
            if (numStr.length() <= 3) {
                group = numStr;
            } else {
                group = numStr.substring(numStr.length() - 3);
            }

            numStr = numStr.substring(0, numStr.length() - 3);
            int groupNumber = Integer.parseInt(group);

            if (groupNumber != 0) {
                String groupWords = "";
                int hundredsDigit = groupNumber / 100;

                if (hundredsDigit > 0) {
                    groupWords += ones[hundredsDigit] + " trăm";
                }

                int tensDigit = (groupNumber % 100) / 10;
                int onesDigit = groupNumber % 10;

                if (tensDigit == 1) {
                    groupWords += " " + teens[onesDigit];
                } else {
                    if (tensDigit > 1) {
                        groupWords += " " + tens[tensDigit];
                    }
                    if (onesDigit > 0) {
                        groupWords += " " + ones[onesDigit];
                    }
                }

                words = groupWords + " " + thousands[thousands.length - numStr.length() / 3 - 1] + " " + words;
            }
        }

        return words.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập một số nguyên: ");
            int number = scanner.nextInt();
            String words = numberToWords(number);
            System.out.println("Số " + number + " được viết bằng chữ là: " + words);
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}

