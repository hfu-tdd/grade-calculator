package ch.tdd;

import java.net.ConnectException;
import java.util.List;

public class UniversityAPI {

    public List<TableOfRecords> findAll() throws ConnectException {
        throw new ConnectException("Connection refused.");
    }
}
