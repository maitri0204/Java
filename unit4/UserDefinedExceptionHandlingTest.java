class InvalidBoxException extends RuntimeException{
    InvalidBoxException(String title){
        super(title);
    }
}

class Box{
    int l,b,h;
    Box(int l, int b,int h)throws InvalidBoxException{
        if(l<=0 || b<=0 || h<=0)
            throw new InvalidBoxException("Box can not be created!!!");
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public static void main(String[] args) {
        Box b = new Box(2,0,5);
        System.out.println("Box Created");
    }
}