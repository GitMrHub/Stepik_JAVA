public  class AsciiCharSequence
        implements  CharSequence{

    
    byte[] array;
    
    public AsciiCharSequence(byte[] a) {
        array = new byte[a.length];
        for(int i=0; i < a.length; i++){
             array[i] = a[i];
        }
    }

    @Override
    public int length(){
        return  array.length;
    }
    
    @Override
    public char charAt(int index){
        return (char) array[index];
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for(int i=0; i < array.length; i++){
            str = str.append((char) array[i]);
        }
        return str.toString();
    }

    @Override
    public CharSequence subSequence(int start, int end){
        byte[] result = new byte[end - start];
        for(int j=0, i=start; i < end; i++, j++){
            result[j] = array[i];
        }
        return new AsciiCharSequence(result);
    }
}
