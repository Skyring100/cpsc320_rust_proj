//https://stackoverflow.com/questions/36136201/how-does-rust-guarantee-memory-safety-and-prevent-segfaults
struct Object{
    x : u32
}
fn main(){
    let obj = Object{x : 5};
    let other = obj;
    //This does not compile in Rust!
    //"obj" cannot be use here since "other" is barrowing the value depsite "obj" being the owner
    //This enforces memory safety as there is only one variable that has ownership at a given point

    println!("{}",obj.x);
}