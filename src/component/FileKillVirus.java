package component;

/**
 * 组合模式：叶子类--继承组件抽象类
 */
public class FileKillVirus extends AbFileKillVirusComponent {
    public FileKillVirus(String fileName) {
        this.fileName = fileName;
    }

    @Override
    void addFile(FileKillVirus fileKillVirus) {

    }

    @Override
    void removeFile(int i) {

    }

    @Override
    FileKillVirus getFile(int i) {
        return this;
    }

    @Override
    void killVirus() {
        System.out.println(fileName + "文件正在杀毒");
    }
}
