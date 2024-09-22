//Ունեք սովորական String փոփոխական, որի մեջ անգլերեն տառերով տեքստա գրած պրոբելներով։։ Դուք պիտի
// գրեք մեթոդ, որը կստանաս տվյալ String-ը որպես պարամետր ու կվերադարձնի String-ում բառերի քանակը։
//Բառ համարվումա ցանկացած մինիմում >=1 տառ(եր)ի հաջորդականությունը Պրոբելների քանակը կարա լինի 1-ից ավել տեքստի մեջ ցանկացած 2 բառի արանքում
//    Լուծումը ստուգում եք տարբեր տեսքի տեքստերի համար։  Ծրագիրը պիտի իտերացիա անի String-ի վրա,
//    String-ի ստանդարտ մեթոդներից կարաք օգտագործեք իտերացիա անելու համար անհրաժեշտները՝ String-ի
//    երկարությունը վերցնելու մեթոդն ու հերթական ինդեքսի տակ գտնվող տառը վերցնելու համար նախատեսված մեթոդը,
//    ոչ ավելին։

package Methods;

public class WordCounter {
    public static void main(String[] args) {
        String text1 = "Hello  our  EPAM group";
        String text2 = "   Java QA   Automation   is   interesting  ";
        String text3 = "Python    and    Java     ";

        System.out.println("Word count in text1: " + countWords(text1));
        System.out.println("Word count in text2: " + countWords(text2));
        System.out.println("Word count in text3: " + countWords(text3));
    }

    static int countWords(String text) {
        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);


            if (currentChar != ' ') {
                if (!isWord) {
                    wordCount++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }
        return wordCount;
    }
}
