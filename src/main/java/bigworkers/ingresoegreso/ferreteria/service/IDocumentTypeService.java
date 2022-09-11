package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entities.DocumentType;
import java.util.List;

public interface IDocumentTypeService {


    public DocumentType findById(long id);


    public List<DocumentType> findAll();


    public DocumentType createDocumentType(DocumentType tipoDocumento);


    public DocumentType updateDocumentType(long id, DocumentType tipoDocumento);


    public void deleteDocumentType(long id);

}
