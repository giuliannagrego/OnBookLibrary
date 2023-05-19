package com.giulianna.OnBookLibrary.service;

import com.giulianna.OnBookLibrary.dto.request.OnBookLibraryRequestDTO;
import com.giulianna.OnBookLibrary.dto.response.OnBookLibraryResponseDTO;
import com.giulianna.OnBookLibrary.repository.OnBookLibraryRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
@Primary
public class OnBookLibraryServiceImp implements OnBookLibraryService {

    private OnBookLibraryRepository onBookLibraryRepository;

    @Override
    public OnBookLibraryResponseDTO findById(Long id) {
        Book book = returnBook(id);
    }

    @Override
    public List<OnBookLibraryResponseDTO> findAll() {
        return null;
    }

    @Override
    public OnBookLibraryResponseDTO register(OnBookLibraryRequestDTO onBookLibraryDTO) {
        return null;
    }

    @Override
    public OnBookLibraryResponseDTO update(OnBookLibraryRequestDTO onBookLibraryDTO, Long id) {
        Book book = returnBook(id);
    }

    @Override
    public String delete(Long id) {
        return null;
    }

    private Book returnBook(Long id) {
        onBookLibraryRepository.findById(id).orElseThrow(()-> new RuntimeException("ID wasn't found on database"));
    }
}
