package bigworkers.ingresoegreso.ferreteriaThymeleaf.service;


import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.DocumentType;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.repository.IDocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class DocumentTypeService implements IDocumentTypeService{

    @Autowired
    private IDocumentTypeRepository documentTypeRepository;


    @Override
    public DocumentType findById(long idDocumentType) {
        Optional<DocumentType> tipoDocumento = documentTypeRepository.findById((long)idDocumentType);
        return tipoDocumento.get();
    }

    @Override
    public List<DocumentType> findAll() {
        List<DocumentType> tiposDocumentos = (List<DocumentType>) documentTypeRepository.findAll();
        return tiposDocumentos;
    }

    @Override
    public DocumentType createDocumentType(DocumentType tipoDocumento) {
        DocumentType newTipoDocumento = documentTypeRepository.save(tipoDocumento);
        return newTipoDocumento;
    }


    @Override
    public DocumentType updateDocumentType(long idDocumentType, DocumentType tipoDocumento) {
        DocumentType putTipoDocumento = documentTypeRepository.save(tipoDocumento);
        return putTipoDocumento;
    }

    @Override
    public void deleteDocumentType(long idDocumentType) {
        documentTypeRepository.deleteById(idDocumentType);
    }
}
