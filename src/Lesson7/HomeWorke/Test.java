package Lesson7.HomeWorke;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {

        System.out.println(oddSumCalculator(100, 300));

        String text = "Treating objects as service providers is a great simplifying tool. This is useful not only during the design process, but also when someone else is trying to understand your code or reuse an object. If they can see the value of the object based on what service it provides, it makes it much easier to fit it into the design. ";
        System.out.println(symbolsInTextFinder(text, new char[]{'a', 'e', 'i'}));

        int[] numbers = new int[]{17, 79, 42, 80, 50, 71, 33, 53, 20, 76, 70, 46, 63, 20, 22, 44, 44, 53, 55, 66, 46, 68, 66, 69, 61, 49, 10, 15, 31, 10, 25, 46, 54, 31, 27, 65, 10, 71, 70, 13, 16, 71, 12, 55, 52, 74, 30, 14, 80, 46};
        System.out.println(averageCalculator(numbers));

        System.out.println(fibonacciCalculator(10000).toString());
    }

    //T1. OddSumCalculator.
    //Найти сумму всех нечетных чисел от 100 до 300.

    private static int oddSumCalculator(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }

    //T2. SymbolsInTextFinder.
    //Найти, сколько раз в следующем тексте встречаются буквы “a”, “e”, “i”.
    //
    //Treating objects as service providers is a great simplifying tool.
    // This is useful not only during the design process, but also when someone else is trying to understand
    // your code or reuse an object. If they can see the value of the object based on what service it provides, it
    // makes it much easier to fit it into the design.

    private static int symbolsInTextFinder(String text, char[] symbols) {
        int sum = 0;
        for (char symbol : symbols) {
            for (char element : text.toCharArray()) {
                if (element == symbol) sum++;
            }
        }
        return sum;
    }

    //T3. AverageCalculator.
    //Найти среднее арифметическое всех чисел из заданного массива:
    //
    //17 79 42 80 50 71 33 53 20 76 70 46 63 20 22 44 44 53 55 66 46 68 66 69 61 49 10 15 31 10 25 46 54 31 27 65 10
    // 71 70 13 16 71 12 55 52 74 30 14 80 46

    private static int averageCalculator(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    //T4. FibonacciCalculator.
    //Найти 10000-й элемент последовательности Фибонначи.
    //
    //F0 = 0,
    //F1 = 1,
    //F2 = F0 + F1 = 1,
    //F3 = F1 + F2 = 2,
    //...

    private static BigDecimal fibonacciCalculator(int n) {
        if (n == 1) return BigDecimal.valueOf(0);
        if (n == 2) return BigDecimal.valueOf(1);
        BigDecimal[] fibonacci = new BigDecimal[n];
        fibonacci[0] = BigDecimal.valueOf(0);
        fibonacci[1] = BigDecimal.valueOf(1);
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1].add(fibonacci[i - 2]);
        }
        return fibonacci[n-1];
    }
}

//Result:
//20200
//72
//45
//20793608237133498072112648988642836825087036094015903119682945866528501423455686648927456034305226515591757343297190158010624794267250973176133810179902738038231789748346235556483191431591924532394420028067810320408724414693462849062668387083308048250920654493340878733226377580847446324873797603734794648258113858631550404081017260381202919943892370942852601647398213554479081823593715429566945149312993664846779090437799284773675379284270660175134664833266377698642012106891355791141872776934080803504956794094648292880566056364718187662668970758537383352677420835574155945658542003634765324541006121012446785689171494803262408602693091211601973938229446636049901531963286159699077880427720289235539329671877182915643419079186525118678856821600897520171070499437657067342400871083908811800976259727431820539554256869460815355918458253398234382360435762759823179896116748424269545924633204614137992850814352018738480923581553988990897151469406131695614497783720743461373756218685106856826090696339815490921253714537241866911604250597353747823733268178182198509240226955826416016690084749816072843582488613184829905383150180047844353751554201573833105521980998123833253261228689824051777846588461079790807828367132384798451794011076569057522158680378961532160858387223882974380483931929541222100800313580688585002598879566463221427820448492565073106595808837401648996423563386109782045634122467872921845606409174360635618216883812562321664442822952537577492715365321134204530686742435454505103269768144370118494906390254934942358904031509877369722437053383165360388595116980245927935225901537634925654872380877183008301074569444002426436414756905094535072804764684492105680024739914490555904391369218696387092918189246157103450387050229300603241611410707453960080170928277951834763216705242485820801423866526633816082921442883095463259080471819329201710147828025221385656340207489796317663278872207607791034431700112753558813478888727503825389066823098683355695718137867882982111710796422706778536913192342733364556727928018953989153106047379741280794091639429908796650294603536651238230626
//
//Process finished with exit code 0