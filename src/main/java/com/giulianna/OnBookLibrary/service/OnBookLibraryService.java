package com.giulianna.OnBookLibrary.service;

import com.giulianna.OnBookLibrary.dto.request.OnBookLibraryRequestDTO;
import com.giulianna.OnBookLibrary.dto.response.OnBookLibraryResponseDTO;
import com.giulianna.OnBookLibrary.entity.OnBookLibrary;
import com.giulianna.OnBookLibrary.repository.OnBookLibraryRepository;
import com.giulianna.OnBookLibrary.util.OnBookLibraryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class OnBookLibraryService {

    private final OnBookLibraryRepository onBookLibraryRepository;

    private final OnBookLibraryMapper onBookLibraryMapper;

    public OnBookLibraryResponseDTO findById(Long id) {
        return onBookLibraryMapper.toOnBookLibraryDTO(returnOnBookLibrary(id));
    }

    public List<OnBookLibraryResponseDTO> findAll() {
        return onBookLibraryMapper.toOnBookLibraryDTO(onBookLibraryRepository.findAll());
    }

    public OnBookLibraryResponseDTO register(OnBookLibraryRequestDTO onBookLibraryDTO) {

        OnBookLibrary onBookLibrary = onBookLibraryMapper.toOnBookLibrary(onBookLibraryDTO);

        onBookLibraryRepository.save(onBookLibrary);

        return onBookLibraryMapper.toOnBookLibraryDTO(onBookLibraryRepository.save(onBookLibrary));
    }

    public OnBookLibraryResponseDTO update(Long id, OnBookLibraryRequestDTO onBookLibraryDTO) {
        OnBookLibrary onBookLibrary = returnOnBookLibrary(id);

        onBookLibraryMapper.updateOnBookLibraryData(onBookLibrary,onBookLibraryDTO);

        onBookLibraryRepository.save(onBookLibrary);

        return onBookLibraryMapper.toOnBookLibraryDTO(onBookLibraryRepository.save(onBookLibrary));
    }

    public String delete(Long id) {
        onBookLibraryRepository.deleteById(id);

        return "ID "+id+" deleted";
    }

    private OnBookLibrary returnOnBookLibrary(Long id) {
        return onBookLibraryRepository.findById(id).orElseThrow(()-> new RuntimeException("ID wasn't found on database"));
    }
}
