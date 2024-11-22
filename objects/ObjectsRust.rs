struct MyObject {
    var1 : u32,
    var2 : u32
}

impl MyObject {
    fn addVars(&self) -> u32{
        return self.var1 + self.var2;
    }
}

fn main(){
    let obj = MyObject {var1 : 5, var2 : 6};
    println!("Adding {0} and {1} equals {2}", obj.var1, obj.var2, obj.addVars());
}