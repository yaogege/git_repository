package toolbean;

import com.google.gson.*;

public class CreateJSON {

	public static void main(String[] args) {

		// 要创建JSON格式的数据，首先要创建一个整体的JSON的对象，作为一个容器
		JsonObject object = new JsonObject();
		// 如果要为当前的JSON对象添加另一个JSON对象，使用add()方法
		// 如果要为当前的JSON对象添加属性值（键值对），使用addProperty()方法
		object.addProperty("category", "it");
		// 接下来构建JSON数组，名称是 languages
		JsonArray array = new JsonArray();
		JsonObject lan1 = new JsonObject();
		lan1.addProperty("id", 1);
		lan1.addProperty("name", "Java");
		lan1.addProperty("ide", "Eclipse");
		// 将 lan1 添加到 array
		array.add(lan1);
		// 将 array 添加到 object，指定 array 的名称： languages（键）
		object.add("languages", array);
		// 添加最后一个属性：pop
		object.addProperty("pop", true);
		// 创建完毕，转换成字符串
		System.out.println(object.toString());
	}
}
