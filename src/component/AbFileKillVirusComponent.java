package component;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式：容器抽象类又组件抽象类--叶子类和混合类都需要继承此类
 */
public abstract class AbFileKillVirusComponent {
    String fileName;
//    String appendStr;
    List<AbFileKillVirusComponent> subFiles = new ArrayList<>();

    abstract void addFile(AbFileKillVirusComponent fileKillVirus);

    abstract void removeFile(int i);

    abstract AbFileKillVirusComponent getFile(int i);

    abstract void killVirus();
}
