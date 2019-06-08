package demandfour;

/**
 *  缺少equals 就会在hashCode方法体上增加提示性注释
 * */
public class HashCodeRule {
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

/**
 *  缺少hashCode 就会在equals方法体上增加提示性注释
 * */
class EqualsRule{
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
