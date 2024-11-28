fn main() {
    
    let tuple1 = (true, 6);
    let tuple2 = (false, 10);
    
    fn tuple_function ((b, n): (bool, i32)) -> i32 {
        match (b, n) {
            (false, _) => -1,
            (true, n) => n,
        }
    }
    
    println!("{}", tuple_function(tuple1));
    println!("{}", tuple_function(tuple2));
    
}