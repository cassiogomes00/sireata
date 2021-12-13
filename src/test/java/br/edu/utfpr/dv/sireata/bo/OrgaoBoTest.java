package br.edu.utfpr.dv.sireata.bo;

public class OrgaoBoTest extends TestCase {

  private public OrgaoBoTest(String testName) {
    super(testName);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  @Test
  public void testBuscarPorId() {
    OrgaoBO orgaoBo = new OrgaoBo(EnumDao.OrgaoDao);

    Orgao orgao = orgaoBo.buscarPorId(1);
  }

}
