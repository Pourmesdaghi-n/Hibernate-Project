package ir.maktab.J2OS.service.impl;

import ir.maktab.J2OS.base.service.impl.BaseEntityServiceImpl;
import ir.maktab.J2OS.domain.Writer;
import ir.maktab.J2OS.repository.WriterRepository;
import ir.maktab.J2OS.service.WriterService;

public class WriterServiceImpl extends BaseEntityServiceImpl<Writer, Long, WriterRepository>
        implements WriterService {

    public WriterServiceImpl(WriterRepository repository) {
        super(repository);
    }
}
