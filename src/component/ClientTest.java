package component;


public class ClientTest {
    /**
     * 组合模式
     * @param args
     */
    public static void main(String[] args) {
        FileKillVirus file1 = new FileKillVirus("文件1");
        FileKillVirus file2 = new FileKillVirus("文件2");
        FileKillVirus file3 = new FileKillVirus("文件3");
        FileKillVirus file4 = new FileKillVirus("文件4");
        FileKillVirus file5 = new FileKillVirus("文件5");
        FileKillVirus file6 = new FileKillVirus("文件6");
    }
}
