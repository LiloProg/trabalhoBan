PGDMP         :                {            empresaEmbalagem    15.2    15.2 +    &           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            '           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            (           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            )           1262    16792    empresaEmbalagem    DATABASE     �   CREATE DATABASE "empresaEmbalagem" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';
 "   DROP DATABASE "empresaEmbalagem";
                postgres    false            �            1259    16817    cliente    TABLE     �   CREATE TABLE public.cliente (
    codigocliente integer NOT NULL,
    nomecliente character varying(40),
    telefone numeric(11,0) NOT NULL,
    rua character varying(40),
    numero numeric(8,0) NOT NULL,
    cep numeric(8,0) NOT NULL
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            �            1259    16816    clientes_codigoCliente_seq    SEQUENCE     �   CREATE SEQUENCE public."clientes_codigoCliente_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public."clientes_codigoCliente_seq";
       public          postgres    false    219            *           0    0    clientes_codigoCliente_seq    SEQUENCE OWNED BY     Z   ALTER SEQUENCE public."clientes_codigoCliente_seq" OWNED BY public.cliente.codigocliente;
          public          postgres    false    218            �            1259    16914    funcionario    TABLE     �   CREATE TABLE public.funcionario (
    codigofuncionario integer NOT NULL,
    nomefuncionario character varying(40) NOT NULL,
    telefone numeric(11,0) NOT NULL,
    email character varying(40),
    salario numeric(8,2)
);
    DROP TABLE public.funcionario;
       public         heap    postgres    false            �            1259    16913 !   funcionario_codigoFuncionario_seq    SEQUENCE     �   CREATE SEQUENCE public."funcionario_codigoFuncionario_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 :   DROP SEQUENCE public."funcionario_codigoFuncionario_seq";
       public          postgres    false    221            +           0    0 !   funcionario_codigoFuncionario_seq    SEQUENCE OWNED BY     i   ALTER SEQUENCE public."funcionario_codigoFuncionario_seq" OWNED BY public.funcionario.codigofuncionario;
          public          postgres    false    220            �            1259    16921    material    TABLE     �   CREATE TABLE public.material (
    codigomaterial integer NOT NULL,
    nomematerial character varying(40) NOT NULL,
    qualidadematerial character varying(20) NOT NULL,
    estoquematerial integer
);
    DROP TABLE public.material;
       public         heap    postgres    false            �            1259    16920    material_codigoMaterial_seq    SEQUENCE     �   CREATE SEQUENCE public."material_codigoMaterial_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE public."material_codigoMaterial_seq";
       public          postgres    false    223            ,           0    0    material_codigoMaterial_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public."material_codigoMaterial_seq" OWNED BY public.material.codigomaterial;
          public          postgres    false    222            �            1259    16810    pedido    TABLE     �   CREATE TABLE public.pedido (
    codigopedido integer NOT NULL,
    precopedido numeric(8,2) NOT NULL,
    metdpagamento character varying(20),
    codigocliente integer,
    codigofuncionario integer,
    codigoproduto integer
);
    DROP TABLE public.pedido;
       public         heap    postgres    false            �            1259    16809    pedido_codigoPedido_seq    SEQUENCE     �   CREATE SEQUENCE public."pedido_codigoPedido_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public."pedido_codigoPedido_seq";
       public          postgres    false    217            -           0    0    pedido_codigoPedido_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public."pedido_codigoPedido_seq" OWNED BY public.pedido.codigopedido;
          public          postgres    false    216            �            1259    16794    produto    TABLE     �   CREATE TABLE public.produto (
    codigoproduto integer NOT NULL,
    modelo character varying(20),
    tamanho character varying(30),
    precoproduto numeric(8,2) NOT NULL,
    estoqueproduto integer,
    codigomaterial integer
);
    DROP TABLE public.produto;
       public         heap    postgres    false            �            1259    16793    produto_codigoProduto_seq    SEQUENCE     �   CREATE SEQUENCE public."produto_codigoProduto_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public."produto_codigoProduto_seq";
       public          postgres    false    215            .           0    0    produto_codigoProduto_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public."produto_codigoProduto_seq" OWNED BY public.produto.codigoproduto;
          public          postgres    false    214            {           2604    16820    cliente codigocliente    DEFAULT     �   ALTER TABLE ONLY public.cliente ALTER COLUMN codigocliente SET DEFAULT nextval('public."clientes_codigoCliente_seq"'::regclass);
 D   ALTER TABLE public.cliente ALTER COLUMN codigocliente DROP DEFAULT;
       public          postgres    false    219    218    219            |           2604    16917    funcionario codigofuncionario    DEFAULT     �   ALTER TABLE ONLY public.funcionario ALTER COLUMN codigofuncionario SET DEFAULT nextval('public."funcionario_codigoFuncionario_seq"'::regclass);
 L   ALTER TABLE public.funcionario ALTER COLUMN codigofuncionario DROP DEFAULT;
       public          postgres    false    220    221    221            }           2604    16924    material codigomaterial    DEFAULT     �   ALTER TABLE ONLY public.material ALTER COLUMN codigomaterial SET DEFAULT nextval('public."material_codigoMaterial_seq"'::regclass);
 F   ALTER TABLE public.material ALTER COLUMN codigomaterial DROP DEFAULT;
       public          postgres    false    223    222    223            z           2604    16813    pedido codigopedido    DEFAULT     |   ALTER TABLE ONLY public.pedido ALTER COLUMN codigopedido SET DEFAULT nextval('public."pedido_codigoPedido_seq"'::regclass);
 B   ALTER TABLE public.pedido ALTER COLUMN codigopedido DROP DEFAULT;
       public          postgres    false    217    216    217            y           2604    16797    produto codigoproduto    DEFAULT     �   ALTER TABLE ONLY public.produto ALTER COLUMN codigoproduto SET DEFAULT nextval('public."produto_codigoProduto_seq"'::regclass);
 D   ALTER TABLE public.produto ALTER COLUMN codigoproduto DROP DEFAULT;
       public          postgres    false    214    215    215                      0    16817    cliente 
   TABLE DATA           Y   COPY public.cliente (codigocliente, nomecliente, telefone, rua, numero, cep) FROM stdin;
    public          postgres    false    219   �4       !          0    16914    funcionario 
   TABLE DATA           c   COPY public.funcionario (codigofuncionario, nomefuncionario, telefone, email, salario) FROM stdin;
    public          postgres    false    221   �5       #          0    16921    material 
   TABLE DATA           d   COPY public.material (codigomaterial, nomematerial, qualidadematerial, estoquematerial) FROM stdin;
    public          postgres    false    223   6                 0    16810    pedido 
   TABLE DATA           {   COPY public.pedido (codigopedido, precopedido, metdpagamento, codigocliente, codigofuncionario, codigoproduto) FROM stdin;
    public          postgres    false    217   S6                 0    16794    produto 
   TABLE DATA           o   COPY public.produto (codigoproduto, modelo, tamanho, precoproduto, estoqueproduto, codigomaterial) FROM stdin;
    public          postgres    false    215   �6       /           0    0    clientes_codigoCliente_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public."clientes_codigoCliente_seq"', 3, true);
          public          postgres    false    218            0           0    0 !   funcionario_codigoFuncionario_seq    SEQUENCE SET     R   SELECT pg_catalog.setval('public."funcionario_codigoFuncionario_seq"', 1, false);
          public          postgres    false    220            1           0    0    material_codigoMaterial_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public."material_codigoMaterial_seq"', 1, false);
          public          postgres    false    222            2           0    0    pedido_codigoPedido_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public."pedido_codigoPedido_seq"', 1, false);
          public          postgres    false    216            3           0    0    produto_codigoProduto_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public."produto_codigoProduto_seq"', 1, true);
          public          postgres    false    214            �           2606    16824    cliente clientes_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT clientes_pkey PRIMARY KEY (codigocliente);
 ?   ALTER TABLE ONLY public.cliente DROP CONSTRAINT clientes_pkey;
       public            postgres    false    219            �           2606    16919    funcionario funcionario_pkey 
   CONSTRAINT     i   ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT funcionario_pkey PRIMARY KEY (codigofuncionario);
 F   ALTER TABLE ONLY public.funcionario DROP CONSTRAINT funcionario_pkey;
       public            postgres    false    221            �           2606    16926    material material_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.material
    ADD CONSTRAINT material_pkey PRIMARY KEY (codigomaterial);
 @   ALTER TABLE ONLY public.material DROP CONSTRAINT material_pkey;
       public            postgres    false    223            �           2606    16815    pedido pedido_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_pkey PRIMARY KEY (codigopedido);
 <   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_pkey;
       public            postgres    false    217                       2606    16799    produto produto_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_pkey PRIMARY KEY (codigoproduto);
 >   ALTER TABLE ONLY public.produto DROP CONSTRAINT produto_pkey;
       public            postgres    false    215            �           2606    17010     pedido pedido_codigocliente_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_codigocliente_fkey FOREIGN KEY (codigocliente) REFERENCES public.cliente(codigocliente) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 J   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_codigocliente_fkey;
       public          postgres    false    217    219    3203            �           2606    17020 $   pedido pedido_codigofuncionario_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_codigofuncionario_fkey FOREIGN KEY (codigofuncionario) REFERENCES public.funcionario(codigofuncionario) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 N   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_codigofuncionario_fkey;
       public          postgres    false    217    221    3205            �           2606    17025     pedido pedido_codigoproduto_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_codigoproduto_fkey FOREIGN KEY (codigoproduto) REFERENCES public.produto(codigoproduto) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 J   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_codigoproduto_fkey;
       public          postgres    false    217    215    3199            �           2606    17015 #   produto produto_codigomaterial_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_codigomaterial_fkey FOREIGN KEY (codigomaterial) REFERENCES public.material(codigomaterial) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 M   ALTER TABLE ONLY public.produto DROP CONSTRAINT produto_codigomaterial_fkey;
       public          postgres    false    3207    223    215               �   x���A
1�uzIk�4�p�R�("��N�����5ۼ�� ˳�G��">eAN`Z��"F�{D�z���Q�"�D`�����â��4�4)3�Bz�86�1�_�<��������ӷtb�����s��4�      !   ~   x�m��
� ��s|�t1�6عo��������:-4��Ϗ�ӶÝ��{"ľ����XQ#�l�.���(I>n��-<C]C���������Ps�~H���\�9��#��r�_Z)���@m      #   4   x�3�,H,H�I��,*���4400�2��妦d&��C��!�pAc�`� �@         9   x�3�450�30�,Ȭ�4�4�4�b�XR~NjI>H�ӈː������+F��� �ki         h   x�E�M
� @���a�_������Ԣ �[t��Pc`����	�>�b!�ew1�`���o$ʦ��BI&��f>x7����!���N��X�
4�~cC�U">�})�     