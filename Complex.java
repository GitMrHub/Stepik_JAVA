public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
        
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof ComplexNumber) {
            ComplexNumber c = (ComplexNumber) o;
            if (getRe() != c.getRe()) return false;
            if (getIm() != c.getIm()) return false;
            return true;
        }
        return false;

    }
   // @Override
         public int hashCode() {
            long bits = Double.doubleToLongBits(re + im);
            return (int) (bits ^ (bits >>> 32));
    }
    
}
