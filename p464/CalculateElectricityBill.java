package p464;

import java.util.Scanner;


// 月の電力使用量（kWh）を引数として受け取り、電気料金（円）を返す関数
// calculateElectricityBillを作成する。
// 電力会社では以下の累進課金制度を採用している。
// ・使用量が120kWh以下の場合：20円/kWh
// ・使用量が121kWh以上300kWh以下の場合：120kWh以下の部分は20円/kWh.超過分は25円/kWh
// ・使用量が301kWh以上の場合：120kWh以下の部分は20円/kWh. 121~300kWhの部分は25円/kWh、超過分は80円/kWh

public class CalculateElectricityBill {

    static int calculateElectricityBill(int usage){

        //電気代使用料
        int total = 0;

        //電力使用量が料金が変わる使用料を超すかどうかを判定？
        int remaining = usage;

        if(remaining>120){
            // 使用量120より多い場合は、120までの使用料金を一旦totalに保持。
            // 120より多い分はremainingに残り量を保持して次のif文で残りの使用料での料金計算する
            total = total + 120*20;
            remaining = remaining -120;
            System.out.println("120より多い");
        }else{
            total = total + remaining*20;
            System.out.println("120より少ない");
            return total;
        }

        if(remaining>180){
            // 使用量180より多い場合は、120までの使用料金を一旦totalに保持。
            // 180より多い分はremainingに残り量を保持して最後の処理で残り量を80円で乗算してこれまでのtotalと合算する
            total = total + 180*25;
            remaining = remaining -180;
            System.out.println("180より多い");
        }else{
            total = total + remaining*25;
            System.out.println("180より少ない");
            return total;
        }

        total = total + remaining*80;
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("電力使用量を入力してください: ");

        if (scanner.hasNextInt()) {
            int usage = scanner.nextInt(); // 整数として取得
            System.out.println(calculateElectricityBill(usage));
            scanner.close();
        }
    }
}


// 実行
// java p464/CalculateElectricityBill.java
