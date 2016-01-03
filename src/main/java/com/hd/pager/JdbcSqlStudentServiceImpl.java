package com.hd.pager;


public class JdbcSqlStudentServiceImpl implements StudentService {
	private StudentDao studentDao;
	
	public JdbcSqlStudentServiceImpl(){
		studentDao = new JdbcSqlStudentDaoImpl();
	}
	@Override
	public Pager<Student> findStudent(Student searchModel, int pageNum,
			int pageSize) {
		Pager<Student> result = studentDao.findStudent(searchModel, pageNum,
				pageSize);
		return result;
	}

}
