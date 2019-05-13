package command.compressplus;


public abstract class AbCompressCommand<T extends ICompressRecevier> {

    protected T compressRecevier;

    /**
     *  Class<T>就是T的类
     * @param tClass
     */
    public AbCompressCommand(Class<T> tClass) {
        try {
//
            // 通过反射获取model的真实类型
//            ParameterizedType pt = (ParameterizedType) getClass().getGenericSuperclass();
//            Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
            // 通过反射创建model的实例
            this.compressRecevier = tClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    abstract void excute();
}
