/**
 * 
 */
package com.sohu.sql4pojo;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.Test;

import com.sohu.sql4text.Sql4TextFileConverter;

/**
 * @author liaohongliu
 *
 * 2012-2-23 ����10:27:31
 */
public class Sql4TextFileConverterTest {
	Sql4TextFileConverter converter = new Sql4TextFileConverter();
	@Test
	public void testQueryForTextFile() throws UnsupportedEncodingException{
		String filePath = ClassLoader.getSystemResource("Users.txt").getFile();
		filePath = java.net.URLDecoder.decode(filePath, "gbk");
		List<String> result = this.converter.queryForTextFile("select id,userName from Users where id=2", filePath, new String[]{"id","userName","birthday"});
		System.out.println(result);
	}
}
