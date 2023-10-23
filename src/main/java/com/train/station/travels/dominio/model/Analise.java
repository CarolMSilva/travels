package com.train.station.travels.model;

import java.math.BigDecimal;


public class Analise {
    
    private BigDecimal avg; //média de bilhetes vendidos
	private BigDecimal max; //maior dia de bilhetes vendidos
	private BigDecimal min; //menor dia de bilhetes vendidos
	private long count; //numero total de bilhetes vendidos
    
    
    public BigDecimal getAvg() {
        return avg;
    }
    public BigDecimal getMax() {
        return max;
    }
    public BigDecimal getMin() {
        return min;
    }
    public long getCount() {
        return count;
    }
    public Analise(BigDecimal avg, BigDecimal max, BigDecimal min, long count) {
        this.avg = avg;
        this.max = max;
        this.min = min;
        this.count = count;
    }

    
}
