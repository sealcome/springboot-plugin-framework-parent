package com.gitee.starblues.extension.mybatis;

import com.gitee.starblues.extension.mybatis.annotation.PluginMapper;
import com.gitee.starblues.factory.process.pipe.classs.PluginClassGroupExtend;
import com.gitee.starblues.realize.BasePlugin;
import com.gitee.starblues.utils.AnnotationsUtils;

/**
 * 插件中的Mapper接口分组
 *
 * @author zhangzhuo
 * @version 1.0
 */
public class PluginMapperGroup implements PluginClassGroupExtend {

    public static final String GROUP_ID = "plugin_mybatis_mapper";

    @Override
    public String groupId() {
        return GROUP_ID;
    }

    @Override
    public void initialize(BasePlugin basePlugin) {

    }

    @Override
    public boolean filter(Class<?> aClass) {
        return AnnotationsUtils.haveAnnotations(aClass, false, PluginMapper.class);
    }

    @Override
    public String key() {
        return "PluginMybatisMapperGroup";
    }
}
