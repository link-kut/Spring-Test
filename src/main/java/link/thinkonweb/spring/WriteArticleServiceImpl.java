package link.thinkonweb.spring;


public class WriteArticleServiceImpl implements WriteArticleService {
	private ArticleDAO articleDAO;
	public WriteArticleServiceImpl() {
		
	}

	public WriteArticleServiceImpl(ArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}
	
	@Override
	public void write(Article article) {
		// TODO Auto-generated method stub
		System.out.println("WriteArticleServiceImpl - write()");
		//before() - method
		articleDAO.insert(article);
		//after() - method
	}

}
