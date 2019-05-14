package component;

/**
 * 组合模式：复合类--继承组件抽象类
 */
public class DirectoryKillVirusComposite extends AbFileKillVirusComponent {
    public DirectoryKillVirusComposite(String fileName) {
        this.fileName = fileName;
    }


    @Override
    void addFile(AbFileKillVirusComponent fileKillVirus) {
        subFiles.add(fileKillVirus);
    }

    @Override
    void removeFile(int i) {
        subFiles.remove(i);
    }

    @Override
    AbFileKillVirusComponent getFile(int i) {
        return subFiles.get(i);
    }

    @Override
    void killVirus() {
        System.out.println(fileName + "文件夹正在杀毒,请稍等...");
        for (AbFileKillVirusComponent item:subFiles){
            item.killVirus();
        }
    }
}
