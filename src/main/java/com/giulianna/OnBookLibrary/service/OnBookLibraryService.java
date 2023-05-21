package com.giulianna.OnBookLibrary.service;

import com.giulianna.OnBookLibrary.dto.request.OnBookLibraryRequestDTO;
import com.giulianna.OnBookLibrary.dto.response.OnBookLibraryResponseDTO;

import java.util.List;

public interface OnBookLibraryService {

    OnBookLibraryResponseDTO findById(Long id);

    List<OnBookLibraryResponseDTO> findAll();

    OnBookLibraryResponseDTO register(OnBookLibraryRequestDTO onBookLibraryDTO);

    OnBookLibraryResponseDTO update(Long id, OnBookLibraryRequestDTO onBookLibraryDTO);

    String delete(Long id);
}
