package config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class JamesTypeFilter implements TypeFilter {

	private ClassMetadata classMetadata;
	/**
	 * MetadataReader：读取到当前正在扫描类的信息
	 * metadataReaderFactory：可以获取到其他任何类信息
	 */
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		// 获取当前类注解的信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		// 获取当前正在扫描的类信息
		classMetadata = metadataReader.getClassMetadata();
		// 获取当前类资源(类路径)
		Resource resource = metadataReader.getResource();
		String className = classMetadata.getClassName();
		System.out.println("--------->className:"+className);
		if (className.contains("Order")) {
			return true;
		}
		return false;
	}

}
