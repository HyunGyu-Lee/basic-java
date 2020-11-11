package io.study.java.project.marketProject;

import java.util.*;

public class MarketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> productNames = Arrays.asList("소고기", "닭고기", "돼지고기", "치토스", "썬칩", "양파링", "고등어", "갈치", "삼치", "소주", "맥주", "양주");
        Map<String, StockInfo> stockInfoMap = new HashMap<>();
        Set<String> stockInfoKeySet = stockInfoMap.keySet();

        for (int i = 0; i < productNames.size(); i++) {
            stockInfoMap.put(productNames.get(i), new StockInfo());
        }

        int stnumber = 0;

        System.out.println("====================");
        System.out.println("   마트 프로그램 시작  ");
        System.out.println("====================");
        while (stnumber != 4) {
            System.out.println("마켓이름을 입력하세요.");
            String marketName = sc.nextLine();
            Market market = new Market(marketName);
            System.out.println("1. 재고 등록");
            System.out.println("2. 재고 확인");
            System.out.println("3. 물건 판매");
            System.out.println("4. 종료");

            stnumber = sc.nextInt();
            switch (stnumber) {

                case 1:
                    System.out.println("항목을 선택하여 주세요.");
                    System.out.println("1. 육류");
                    System.out.println("2. 어류");
                    System.out.println("3. 스낵류");
                    System.out.println("4. 주류");
                    int secnumber = sc.nextInt();
                    switch (secnumber) {
                        case 1:
                            int thnumber = 0;
                            while (thnumber != 4) {
                                System.out.println("고기 종류를 선택하여 주세요.");
                                System.out.println("1. 소고기");
                                System.out.println("2. 닭고기");
                                System.out.println("3. 돼지고기");
                                System.out.println("4. 종료");
                                thnumber = sc.nextInt();
                                if (thnumber >= 4) {
                                    break;
                                }

                                System.out.println("갯수를 입력하여 주세요.");
                                int meatEa = sc.nextInt();
                                if (thnumber == 1) {
                                    stockInfoMap.get("소고기").setStock(meatEa);
                                    System.out.println("가격을 입력하세요.");
                                    int priceBeaf = sc.nextInt();
                                    stockInfoMap.get("소고기").setPrice(priceBeaf);
                                } else if (thnumber == 2) {
                                    stockInfoMap.get("닭고기").setStock(meatEa);
                                    System.out.println("가격을 입력하세요.");
                                    int priceChicken = sc.nextInt();
                                    stockInfoMap.get("닭고기").setPrice(priceChicken);
                                } else if (thnumber == 3) {
                                    stockInfoMap.get("돼지고기").setStock(meatEa);
                                    System.out.println("가격을 입력하세요.");
                                    int pricePork = sc.nextInt();
                                    stockInfoMap.get("돼지고기").setPrice(pricePork);
                                }
                            }
                            break;
                        case 2:
                            int fonumber = 0;
                            while (fonumber != 4) {
                                System.out.println("어류를 선택하여 주세요.");
                                System.out.println("1. 고등어");
                                System.out.println("2. 갈치");
                                System.out.println("3. 삼치");
                                System.out.println("4. 종료");
                                fonumber = sc.nextInt();
                                if (fonumber >= 4) {
                                    break;
                                }
                                System.out.println("갯수를 입력하여 주세요.");

                                int fishEa = sc.nextInt();
                                if (fonumber == 1) {
                                    stockInfoMap.get("고등어").setStock(fishEa);
                                    System.out.println("가격을 입력하세요.");
                                    int priceMackerel = sc.nextInt();
                                    stockInfoMap.get("고등어").setPrice(priceMackerel);
                                } else if (fonumber == 2) {
                                    stockInfoMap.get("갈치").setStock(fishEa);
                                    System.out.println("가격을 입력하세요.");
                                    int priceHairtail = sc.nextInt();
                                    stockInfoMap.get("갈치").setPrice(priceHairtail);
                                } else if (fonumber == 3) {
                                    stockInfoMap.get("삼치").setStock(fishEa);
                                    System.out.println("가격을 입력하세요.");
                                    int priceThreefish = sc.nextInt();
                                    stockInfoMap.get("삼치").setPrice(priceThreefish);
                                }
                            }
                            break;
                        case 3:
                            int finumber = 0;
                            while (finumber != 4) {
                                System.out.println("스낵를 선택하여 주세요.");
                                System.out.println("1. 치토스");
                                System.out.println("2. 썬칩");
                                System.out.println("3. 양파링");
                                System.out.println("4. 종료");
                                finumber = sc.nextInt();
                                if (finumber >= 4) {
                                    break;
                                }

                                System.out.println("갯수를 입력하여 주세요.");
                                int snackEa = sc.nextInt();
                                if (finumber == 1) {
                                    stockInfoMap.get("치토스").setStock(snackEa);
                                    System.out.println("가격을 입력하세요.");
                                    int priceChitos = sc.nextInt();
                                    stockInfoMap.get("치토스").setPrice(priceChitos);
                                } else if (finumber == 2) {
                                    stockInfoMap.get("썬칩").setStock(snackEa);
                                    System.out.println("가격을 입력하세요.");
                                    int priceSunchip = sc.nextInt();
                                    stockInfoMap.get("썬칩").setPrice(priceSunchip);
                                } else if (finumber == 3) {
                                    stockInfoMap.get("양파링").setStock(snackEa);
                                    System.out.println("가격을 입력하세요.");
                                    int priceOnionRing = sc.nextInt();
                                    stockInfoMap.get("양파링").setPrice(priceOnionRing);
                                }
                            }
                            break;
                        case 4:
                            int sinumber = 0;
                            while (sinumber != 4) {
                                System.out.println("주류를 선택하여 주세요.");
                                System.out.println("1. 소주");
                                System.out.println("2. 맥주");
                                System.out.println("3. 양주");
                                System.out.println("4. 종료");
                                sinumber = sc.nextInt();
                                if (sinumber >= 4) {
                                    break;
                                }

                                System.out.println("갯수를 입력하여 주세요.");
                                int drinkEa = sc.nextInt();
                                if (sinumber == 1) {
                                    stockInfoMap.get("소주").setStock(drinkEa);
                                    System.out.println("가격을 입력하세요.");
                                    int priceSoju = sc.nextInt();
                                    stockInfoMap.get("소주").setPrice(priceSoju);
                                } else if (sinumber == 2) {
                                    stockInfoMap.get("맥주").setStock(drinkEa);
                                    System.out.println("가격을 입력하세요.");
                                    int priceBeer = sc.nextInt();
                                    stockInfoMap.get("맥주").setPrice(priceBeer);
                                } else if (sinumber == 3) {
                                    stockInfoMap.get("양주").setStock(drinkEa);
                                    System.out.println("가격을 입력하세요.");
                                    int priceWisky = sc.nextInt();
                                    stockInfoMap.get("양주").setPrice(priceWisky);
                                }
                            }
                            break;
                    }
                case 2:
                    if (stnumber == 2) {

                        if (stockInfoKeySet.size() == 0) {
                            System.out.println("재고가 없습니다.");
                        } else {
                            for (String key : stockInfoKeySet) {
                                if (stockInfoMap.get(key).getStock() != 0) {
                                    stockInfoMap.get(key).printStock(key);
                                }
                            }
                        }
                    }

                case 3:
                    if (stnumber == 3) {
                        System.out.println("금액을 지불해주세요.");
                        int consumePrice = sc.nextInt();
                        Map<String, Integer> last = new HashMap();
                        System.out.println("물건 판매를 시작합니다.");
                        int finish = 0;
                        while (finish != 2) {
                            System.out.println("구매할 물건을 골라주세요.");
                            sc.nextLine();
                            String consume = sc.nextLine();
                            System.out.println("수량을 입력해주세요.");
                            int consumeEa = sc.nextInt();

                            last.put(consume, consumeEa);

                            System.out.println("더 구매하시겠습니까?(1 or 2)");
                            System.out.println("1. 아직 살게 남았다..");
                            System.out.println("2. 돈없다 그만 살래..");
                            sc.nextLine();
                            finish = sc.nextInt();

                        }
                        Set<String> lastKeySet = last.keySet();
                        int a = 0;
                        int m = 0;

                        lastKeySet.retainAll(stockInfoKeySet);
                        List<String> con = new ArrayList();

                        for(String n : lastKeySet){
                            System.out.print(n + "을 구매하였습니다. ");
                            System.out.println(" ");
                            con.add(n);
                        }
                        for(int i=0;i<con.size();i++){
                            String con1 =con.get(i);
                            m = stockInfoMap.get(con1).getPrice() * last.get(con1);
                            a = a + m;
                        }
                        System.out.println("총 구매 금액은 " + a + "원 입니다.");
                        System.out.println("잔돈 " + (consumePrice - a) + "원 드립니다.");
                        System.out.println("안녕히 가셈");
                    }

            }
        }
    }
}
