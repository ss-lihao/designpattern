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
        DirectoryKillVirusComposite composite1 = new DirectoryKillVirusComposite("文件夹1");
        composite1.addFile(file2);
        composite1.addFile(file3);
        DirectoryKillVirusComposite composite2 = new DirectoryKillVirusComposite("文件夹2");
        composite2.addFile(file4);
        composite2.addFile(file5);
        composite2.addFile(composite1);
        DirectoryKillVirusComposite composite3 = new DirectoryKillVirusComposite("文件夹3");
        composite3.addFile(file6);
        DirectoryKillVirusComposite rootComposite = new DirectoryKillVirusComposite("根文件夹");
        rootComposite.addFile(file1);
        rootComposite.addFile(composite2);
        rootComposite.addFile(composite3);
        System.out.println("------开始杀毒------");
        rootComposite.killVirus();
        System.out.println("------杀毒完成------");
    }
}
