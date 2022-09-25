package bigworkers.ingresoegreso.ferreteriaThymeleaf.service;



import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.DocumentType;

import java.util.List;

public interface IDocumentTypeService {
    DocumentType findById(long idDocumentType);
    public List<DocumentType> findbyAll();

    List<DocumentType> findAll();

    public DocumentType createDocumentType(DocumentType documentType);

    DocumentType updateDocumentType(long idDocumentType, DocumentType documentType);


    void deleteDocumentType(long idDocumentType);
}
