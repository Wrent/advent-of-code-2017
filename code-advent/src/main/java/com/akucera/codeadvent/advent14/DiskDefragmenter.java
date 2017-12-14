package com.akucera.codeadvent.advent14;


import com.akucera.codeadvent.advent10.KnotHash;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by akucera on 14.12.17.
 */
public class DiskDefragmenter {

    private int regionCounter;
    private KnotHash knotHash = new KnotHash();

    public int countFullBlocks(String s) {
        int cnt = 0;

        boolean[][] grid = new boolean[128][128];

        for (int i = 0; i < 128; i++) {
            BigInteger h = new BigInteger(knotHash.getStringHash(256, s + "-" + i).toUpperCase(),16);
            String bin = h.toString(2);
            for (int j = 0; j < bin.length(); j++) {
                grid[i][j] = bin.charAt(j) == '1' ? true : false;
                if (bin.charAt(j) == '1') {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public int countRegions(String s) {
        regionCounter = 0;
        Cell[][] grid = new Cell[128][128];

        for (int i = 0; i < 128; i++) {
            String str = knotHash.getStringHash(256, s + "-" + i).toUpperCase();
            BigInteger h = new BigInteger(str,16);
            String bin = h.toString(2);
            while (bin.length() < 128) {
                bin = "0" + bin;
            }
            for (int j = 0; j < 128; j++) {
                grid[i][j] = bin.charAt(j) == '1' ? new Cell(true) : new Cell(false);
            }
        }

        for (int i = 0; i < 128; i++) {
            for (int j = 0; j < 128; j++) {
                processCell(grid, i, j);
            }
        }
        return regionCounter;
    }

    private void processCell(Cell[][] grid, int i, int j) {

        Cell cell = grid[i][j];
        if (cell.getBlock() == 0 && cell.isVal()) {
            regionCounter++;
            cell.setBlock(regionCounter);
            process(grid, i - 1, j);
            process(grid, i + 1, j);
            process(grid,  i, j - 1);
            process(grid, i, j + 1);
        }
    }

    private void process(Cell[][] grid, int i, int j) {
        if (j < 0 || j > 127) {
            return;
        }
        if (i < 0 || i > 127) {
            return;
        }
        Cell cell = grid[i][j]; if (cell.getBlock() == 0 && cell.isVal()) {
            cell.setBlock(regionCounter);
            process(grid, i - 1, j);
            process(grid, i + 1, j);
            process(grid,  i, j - 1);
            process(grid, i, j + 1);
        }

    }
}
