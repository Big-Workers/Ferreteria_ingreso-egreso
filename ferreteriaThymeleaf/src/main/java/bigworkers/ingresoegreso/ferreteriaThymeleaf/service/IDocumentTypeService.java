package bigworkers.ingresoegreso.ferreteriaThymeleaf.service;



import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.DocumentType;

import java.util.List;

public interface IDocumentTypeService {


    public DocumentType findById(int id);


    public List<DocumentType> findAll();


    public DocumentType createDocumentType(DocumentType tipoDocumento);


    public DocumentType updateDocumentType(int id, DocumentType tipoDocumento);


    public void deleteDocumentType(int id);

}
