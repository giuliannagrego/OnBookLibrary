package com.giulianna.OnBookLibrary.repository;

import com.giulianna.OnBookLibrary.entity.OnBookLibrary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnBookLibraryRepository extends JpaRepository<OnBookLibrary, Long> {
}
