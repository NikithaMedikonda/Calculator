public Calculator{
    public sub(int x,int y){
    return x-y;}
    public int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args){
    Calculator c = new Calculator();
    System.out.println("Add: " + c.add(5,4));
    System.out.println("Sub: " + c.sub(5,4));
    }
}
