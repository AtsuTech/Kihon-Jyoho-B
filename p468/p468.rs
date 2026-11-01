// fn main(){
//     let currentSum=0;
//     let maxSum=0;
//     //let i;
//     let data = vec![-2,1,-3,4,-1,2,1,-5,4];
//     for i in 0..8 {
//         //println!("{v}");
//         if currentSum >0 {
//             currentSum = data[i];
//         }else{
//             currentSum = currentSum + data[i];
//         }
//         if currentSum > maxSum {
//             maxSum = currentSum;
//         }
//     }
//     println!("{maxSum}");
// }


//　求めるもの　部分配列の和
// 6（[4, -1, 2, 1]）
fn main() {
    let data = vec![-2, 1, -3, 4, -1, 2, 1, -5, 4];

    let mut current_sum = data[0];
    let mut max_sum = data[0];

    for &x in &data[1..] {
        if current_sum > 0 {
            current_sum += x; // 前までの合計がプラスなら、続けて足す
        } else {
            current_sum = x; // マイナス以下なら、ここから新しく始める
        }
        if current_sum > max_sum {
            max_sum = current_sum;
        }
    }

    println!("{max_sum}"); 
}

// cd p468
// rustc p468.rs
// ./p468