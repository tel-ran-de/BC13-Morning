public class EnigmaCaesar {
    public static void main(String[] args) {
        String originalMessage = "Съешь же ещё этих мягких французских булок, да выпей чаю.";
        String benchmark = "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб.";
        System.out.println(enigmaCaesar(originalMessage.toLowerCase()));
        System.out.println(enigmaCaesar(originalMessage).equalsIgnoreCase(benchmark));
    }

    public static String enigmaCaesar(String input) {
        String output = "";
        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            output = output + getMeCaesarChar(input.charAt(i));
        }
        return output;
    }

    //Исходный алфавит: А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я
    //Шифрованный:      Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я А Б В

    private static String getMeCaesarChar(char myInputChar) {
        String caesarSymbol = "";
        String inputSource = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ .,";
        String outputSource = "ГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯАБВ .,";
        for (int i = 0; i < inputSource.length(); i++) {
            if (inputSource.charAt(i) == myInputChar){
                caesarSymbol = String.valueOf(outputSource.charAt(i));
            }
        }
        return caesarSymbol;
    }
}
