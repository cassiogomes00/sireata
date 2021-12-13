package br.edu.utfpr.dv.sireata.dao;

public class FactoryDao {

  public static IDao createDao(EnumDao dao) {
    if (dao.equals(EnumDao.AnexoDao)) {
      return new AnexoDao();
    }

    if (dao.equals(EnumDao.AtaDao)) {
      return new AtaDao();
    }

    if (dao.equals(EnumDao.AtaParticipanteDao)) {
      return new AtaParticipanteDao();
    }

    if (dao.equals(EnumDao.CampusDao)) {
      return new CampusDao();
    }

    if (dao.equals(EnumDao.ComentarioDao)) {
      return new ComentarioDao();
    }

    if (dao.equals(EnumDao.ConnectionDao)) {
      return new ConnectionDao();
    }

    if (dao.equals(EnumDao.DepartamentoDao)) {
      return new DepartamentoDao();
    }

    if (dao.equals(EnumDao.OrgaoDao)) {
      return new OrgaoDao();
    }

    if (dao.equals(EnumDao.PautaDao)) {
      return new PautaDao();
    }

    if (dao.equals(EnumDao.UsuarioDao)) {
      return new UsuarioDao();
    }

    throw new Exception("Dao nao encontrado");
  }
}
