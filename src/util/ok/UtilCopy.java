package util.ok;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class UtilCopy {
	
	public static Object EntityCopy(Object obj) throws Exception{
		// 获取对象class
		Class<?> clazz = obj.getClass();
		Object newObj = clazz.newInstance();
		while (clazz != Object.class) {
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				String fieldName = field.getName();
				String fieldUc = String.valueOf(fieldName.charAt(0)).toUpperCase()+fieldName.substring(1);
				String setMdNm = SG.SET+ fieldUc;
				String getMdNm = SG.GET+ fieldUc;
				Method setMd = clazz.getDeclaredMethod(setMdNm, field.getType());
				Method getMd = clazz.getDeclaredMethod(getMdNm);
				setMd.invoke(newObj, getMd.invoke(obj).getClass());
			}
			clazz = clazz.getSuperclass();
		}

		return newObj;
	}
}
