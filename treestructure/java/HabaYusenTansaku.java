package treestructure.java;

import java.util.ArrayList;


// p.234の幅優先探索の解説コードを実演


//キューを表現するクラス
class Queue {

    //キューを表す変数
    ArrayList<Integer> queue ;


    //コンストラクタ
    Queue(){
        //空のキューを生成する
        queue = new ArrayList<>();
    }

    //キューに要素を追加
    public void enqueue(int d){
        queue.add(d);
    }

    //最初に追加したキュー(配列の最後の要素)を取り出す
    public int dequeue(){
        return queue.remove(0);
    }

    //キューの有無
    public boolean isEmpty(){
        return queue.isEmpty();
    }

}

//メインクラス
public class HabaYusenTansaku {
    public static void main(String[] args) {

        //エッジ
        int[][] edge = {
            {}, //書籍のコードでは配列のindexが1から始まるので、それに合わせて使用しないダミーを先頭に置く
            {2, 3},   
            {4, 5},   
            {6, 7},   
            {},       
            {},       
            {},      
            {8},      
            {}   
        };

        Queue q = new Queue();
        q.enqueue(1);

        int i;

        while (q.isEmpty() == false) {
            i = q.dequeue();
            System.out.println(i);
            if(i < edge.length){
                for(int j=0;j<edge[i].length;j++){
                    q.enqueue(edge[i][j]);
                }
            }
        }
    }
}

// javac treestructure/java/HabaYusenTansaku.java
// java treestructure/java/HabaYusenTansaku

//   or

// java treestructure/java/HabaYusenTansaku.java 