package component;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式：容器抽象类又组件抽象类--叶子类和混合类都需要继承此类
 */
public abstract class AbFileKillVirusComponent {
    String fileName;

    List<FileKillVirus> subFiles = new ArrayList<>();

    abstract void addFile(FileKillVirus fileKillVirus);

    abstract void removeFile(int i);

    abstract FileKillVirus getFile(int i);

    abstract void killVirus();
}
