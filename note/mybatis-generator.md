## mybatis 数据库逆向生成 (mybatis generator)

> 简单来说，Mybatis逆向工程可以根据数据库的表来逆向生成相关java代码和sql语句，如Pojo.java,Mapper.java，mapper.xml。虽然mapper接口及其配置文件我们完全可以自己写，不过当表数量很多，关联复杂时，用MyBatis Generator逆向工程就十分方便了。当然了，我们也可以根据业务逻辑修改其生成的mapper


### How to use mybatis generator 

```java
package com.youkou.mybatis.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class GeneratorDisplay {

	public void generator() throws Exception {

		List<String> warnings = new ArrayList<>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
        //配置文件中
		File configFile = new File("generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

	} 
	
	public static void main(String[] args) throws Exception {
		try {
			GeneratorDisplay generatorSqlmap = new GeneratorDisplay();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
```