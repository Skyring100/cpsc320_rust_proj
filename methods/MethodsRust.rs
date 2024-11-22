fn test(param1 : u32, param2 : u32, param3 : char, param4 : char) -> u32{
    println!("The two characters are {0}, {1}",param3, param4);
    let answer = param1 + param2;
    return answer;

}

fn main(){
    let w = 5;
    let x = 6;
    let y = 'd';
    let z = 'c';
    let ans = test(w,x, y,z);
    println!("Adding the two numbers makes {}", ans);
}