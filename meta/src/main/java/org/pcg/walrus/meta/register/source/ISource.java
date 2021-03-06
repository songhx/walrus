package org.pcg.walrus.meta.register.source;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.pcg.walrus.common.env.WContext;
import org.pcg.walrus.common.exception.WMetaException;
import org.pcg.walrus.meta.pb.WTableMessage;

public interface ISource {

    /*
     * register source data to dataset
     */
    public Dataset<Row> register(WContext context, WTableMessage.WTablet tablet) throws WMetaException;

}
